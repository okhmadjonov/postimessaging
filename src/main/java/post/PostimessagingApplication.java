package post;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import post.models.Log;

import java.io.*;
import java.nio.file.Files;

@SpringBootApplication
public class PostimessagingApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(PostimessagingApplication.class, args);


		try{
			FileInputStream filestream = new FileInputStream("log.log");
			BufferedReader br = new BufferedReader(new InputStreamReader(filestream));
			String strLine;
			int info = 0;
			int error = 0;
			int warning = 0;
			int debug = 0;
			int verbose = 0;

			while ((strLine = br.readLine()) != null)   {
				if(strLine.contains("INFO")){info++;}
				if(strLine.contains("ERROR")){error++;}
				if(strLine.contains("WARNING")){warning++;}
				if(strLine.contains("DEBUG")){debug++;}
				if(strLine.contains("VERBOSE")){verbose++;}
				String code;
				if (strLine.contains("guid")) {
					code = strLine.substring(0, 19);
					System.out.println(code);
				}
			}


			System.out.println("\n");
			System.out.println("Number of INFO: " + info);
			System.out.println("Number of ERROR: " + error);
			System.out.println("Number of WARNING: " + warning);
			System.out.println("Number of DEBUG: " + debug);
			System.out.println("Number of VERBOSE: " + verbose);


			filestream.close();
		}
		catch (Exception e){System.err.println("Error: " + e.getMessage());}




	}

}
