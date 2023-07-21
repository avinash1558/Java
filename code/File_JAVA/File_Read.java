import java.io.*;

public class File_Read {
    public static void main(String[] args){
    File file=new File("C:\\Users\\avina\\OneDrive\\Desktop\\codes\\java\\code\\File_JAVA\\avinash.txt");
    FileInputStream re=new FileInputStream(file);
    int r=0;
    while((r=re.read())!=-1){
        System.out.println((char)(r));
    }
    }
}
