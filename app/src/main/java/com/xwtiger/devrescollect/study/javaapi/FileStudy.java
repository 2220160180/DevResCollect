package com.xwtiger.devrescollect.study.javaapi;

import java.io.File;
import java.io.IOException;

/**
 * Created by Busap-112 on 2017/11/3.
 */

public class FileStudy {

    public void main(String[] args){


    }

    public static File makeFile(){
        String path = "d:\\test20171201\\hahah\\张三\\";
        String filename = "2574.txt";
        return makeNewFile(path,filename);
    }

    /**
     *  File file = new File("d:\\test20171102");
     * @param path
     */
    public static File makeNewFile(String path,String filename)throws NullPointerException{
        File filedir = new File(path);
        LogUtils.printString("makeNewFile","before",filedir.exists()+"");
        if(!filedir.exists()){
            filedir.mkdirs();
        }
        File fileName = new File(path,filename);
        try {
            if(!fileName.exists()){
                boolean newFile = fileName.createNewFile();
                System.out.println("newFile ="+"重新创建");
            }else{
                System.out.println("newFile ="+"已经创建过了");
            }
            return fileName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 删除指定的目录和文件
     * @param file
     */
    public static void deleteDirAndFile(File file) {
        if (file.isDirectory()) {
            System.out.println("dir ="+file.getPath());
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                File file_temp = files[i];
                deleteDirAndFile(file_temp);
            }
            file.delete();
        } else if (file.isFile()) {
            file.delete();
            System.out.println("file ="+file.getName());
        }
    }

}
