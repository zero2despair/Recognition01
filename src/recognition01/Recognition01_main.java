package recognition01;

import java.io.File;
import java.io.FileNotFoundException;

import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectFacesOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectedFaces;

public class Recognition01_main {

	public static void main(String[] args){


	VisualRecognition service = new VisualRecognition("2018-05-17");
	service.setApiKey("j16011");

	DetectFacesOptions detectFacesOptions =null;
	try{
		detectFacesOptions = new DetectFacesOptions.Builder()
	  .imagesFile(new File("img/faker-ftkj8re8.png"))
	  .build();
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}
	DetectedFaces result = service.detectFaces(detectFacesOptions).execute();
	System.out.println(result);

	}
}
