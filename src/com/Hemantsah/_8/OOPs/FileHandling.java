import java.io.*;

//createFile
//class createfile{
//    public static void main(String[] args) {
//        File f=new File("C:\\Program Files\\JavaQues\\OOPs\\src\\hemant.txt"); //creating object for file
//
//        try{  //we can also use 'throws' for exception handling in which JVM will handle the exception
//            if(f.createNewFile()){   //create a new file for 'f' object
//                System.out.println("File sucessfully created");
//            }else{
//                System.out.println("File Already Exist");
//            }
//        }
//       catch(IOException e){
//           System.out.println(e);
//       }
//
//    }
//}


//FileInfo
//class fileInfo{
//    public static void main(String[] args) {
//        File f=new File("C:\\Program Files\\JavaQues\\OOPs\\src\\hemant.txt");
//
//        if(f.exists()){
//            System.out.println("File name : "+f.getName());
//            System.out.println("File location : "+f.getAbsolutePath());
//            System.out.println("File write : "+f.canWrite());
//            System.out.println("File read : "+f.canRead());
//            System.out.println("File size : "+f.length());
//        }else{
//            System.out.println("File doesn't exist");
//        }
//    }
//}


////FileWriter
//class writer{
//    public static void main(String[] args) {
//        try{  //if there is exception in file location
//            FileWriter f=new FileWriter("C:\\Program Files\\JavaQues\\OOPs\\src\\nishu.txt"); //FileWriter is a class use for creating and writing in file
//            try{
//                f.write("Hello my 1st file has been created/write in java");
//            }
//            finally{
//                f.close();
//            }
//            System.out.println("File write sucessfully");
//
//        }
//        catch(IOException e){
//            System.out.println(e);
//        }
//        }
//
//}

////fileReader
//class reader{
//    public static void main(String[] args) {  //we can also use throws so that JVM can handle exception
//        try {
//            FileReader r = new FileReader("C:\\Program Files\\JavaQues\\OOPs\\src\\nishu.txt");
//            try {
//                int i;
//                while ((i = r.read()) != -1) {  //read data character by character
//                    System.out.print((char)i);
//                }
//            } finally {
//                r.close();
//            }
//        }
//            catch(IOException e){
//                System.out.println("File has not been read");
//            }
//
//    }
//}

////file rename
//class rename{
//    public static void main(String[] args) {
//
//        File p=new File("C:\\Program Files\\JavaQues\\OOPs\\src\\hemat.txt");
//        File c=new File("C:\\Program Files\\JavaQues\\OOPs\\src\\zatch.txt");
//        if(p.exists()){
//            System.out.println(p.renameTo(c));
//        }else{
//            System.out.println("File doesn't exist");
//        }
//    }
//}

////copy file
//class copyfile{
//    public static void main(String[] args) throws IOException{
//        FileInputStream in=new FileInputStream("C:\\Program Files\\JavaQues\\OOPs\\src\\zatch.txt");
//        FileOutputStream ou=new FileOutputStream("C:\\Program Files\\JavaQues\\OOPs\\src\\bali.txt"); //it is use to create file and write operation
//        int j;
//        while((j=in.read())!=-1){
//            ou.write(j);
//        }
//        System.out.println("Data Copy Sucessfully");
//    }
//}