package org.example.mvc.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.UUID;

/**
 * @Author ZhangZengY
 * @Date 2023/6/1 19:57
 * @Package org.example.mvc.controller
 * @Project springMVC
 */
@Controller
public class FileController {
    @RequestMapping("/fileDown")
    public ResponseEntity<byte[]> fileDown(HttpSession session) throws Exception {
        String filename = "3.jpg";
        ServletContext servletContext = session.getServletContext();
        String realPath = servletContext.getRealPath("/static/img/3.jpg");
        InputStream inputStream = new FileInputStream(realPath);
        //获取输入流对应的所有字节数
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        //创建httpheaders对象设置响应头信息
        MultiValueMap<String, String> headers = new HttpHeaders();
        //设置下载方式及文件的名字
        headers.add("Content-Disposition", "attachment;filename=" + filename);
        //设置响应状态码
        HttpStatus httpStatus = HttpStatus.OK;
        //创建ResponseEntity对象 bytes响应体  headers响应头  httpStatus响应状态码
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, httpStatus);
        inputStream.close();
        return responseEntity;
    }

    @RequestMapping("/fileUp")
    public String fileUp(MultipartFile photo,HttpSession session) throws Exception {
        ServletContext servletContext = session.getServletContext();
        String path = servletContext.getRealPath("img");
        File file = new File(path);
        if(!file.exists()){
            //判断路径是否存在,不存在则创建
            file.mkdir();
        }
        String filename = photo.getOriginalFilename();
        String suffixName = filename.substring(filename.lastIndexOf("."));
        //使用UUID作为文件名
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        String finalFileName = uuid + suffixName;
        String finalPath = path + File.separator + finalFileName;
        photo.transferTo(new File(finalPath));
        return "success";
    }

}
