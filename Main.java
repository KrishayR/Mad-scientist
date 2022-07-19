import java.io.File;  
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileWriter; // Import the FileWriter class to write text files


public class Main {
  public static void main(String[] args) throws Exception {
    // Set up
    int counter = 0;
    boolean check = true;
    // Fetching text content from file
    Scanner reader = new Scanner(new File("breedflip.in"));
    int n = reader.nextInt();
    reader.nextLine();
    String input = reader.nextLine();
    String output = reader.nextLine();
    reader.close();

    for (int i = 0; i < n; i++){
      if(input.charAt(i) != output.charAt(i)){
        if(check == true){
          counter++;
        }
          check = false;
      } else{
        check = true;
      }
  }
    FileWriter writer = new FileWriter("breedflip.out");
    writer.write(String.valueOf(counter));
    writer.close();
}
}
