package jy.park.demo1.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static List<String> getFileInfoByRow(String path){
        List<String> result = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
            String line ;
            while((line = br.readLine()) != null)
                result.add(line);

            if(br != null){
                br.close();
            }
            return result;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
