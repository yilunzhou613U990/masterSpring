package com.smart.beanfactory;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.WritableResource;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileSourceExample {
    public static void main(String[] args) {
        try {
            String filePath = "C:\\Users\\Administrator\\IdeaProjects\\masterSpring\\chapter4\\src\\main\\resources\\conf\\file1.txt";
            WritableResource res1 = new PathResource(filePath);
            Resource res2 = new ClassPathResource("conf/file1.txt");
            OutputStream stream1 = res1.getOutputStream();
            stream1.write("what to do ??????????\nno idea".getBytes());
            stream1.close();
            InputStream ins1 = res1.getInputStream();
            InputStream ins2 = res2.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int i;
            while ((i = ins1.read()) != -1) {
                baos.write(i);
            }
            System.out.println(baos.toString());
            System.out.println(res1.getFilename());
            System.out.println(res2.getFilename());
        } catch (Exception e) {

        }
    }
}
