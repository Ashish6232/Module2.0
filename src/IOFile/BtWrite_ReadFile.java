package IOFile;

import accessModifier.Test;

import java.io.*;
import java.util.ArrayList;

public class BtWrite_ReadFile {
    ArrayList<Student>students=new ArrayList<>();
    Student student =new Student();
    public void writeFileStudent() {
        final String PATH = "E:\\codeGym\\testModule2\\src\\hocvien.txt";
        try {
            FileWriter fileWriter = new FileWriter(PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Student student : students) {
                line = student.getId() + ";" + student.getFullName() + ";" + student.getEmail() + ";" + student.getMarch() + "\n";
                bufferedWriter.write(line);
                bufferedWriter.flush();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile() {
        final String PATH = "E:\\codeGym\\testModule2\\src\\hocvien.txt";
        BufferedReader bufferedReader = null;
        String line = "";
        String splitBy = ";";
        String[] information;
        try {
            bufferedReader = new BufferedReader(new FileReader(PATH));
            while ((line = bufferedReader.readLine()) != null) {
                information = line.split(splitBy);
                student = new Student(information[0], information[1], information[2], Integer.parseInt(information[3]));
                students.add(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        BtWrite_ReadFile btWrite_readFile =new BtWrite_ReadFile();
        btWrite_readFile.writeFileStudent();
        btWrite_readFile.readFile();
    }
}
