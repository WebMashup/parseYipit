import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import com.google.gson.Gson;


@SuppressWarnings("serial")
public class yipitRead {
	
	public List<yipit> searchDeals(String query) throws Exception {
		query = query.trim();
		if (query.isEmpty()) {
			throw new IllegalArgumentException("No search query specified.");
		}

		// see: https://dev.twitter.com/docs/api/1/get/search
		String q = URLEncoder.encode(query, "UTF-8");
		URL url = new URL("http://api.yipit.com/v1/deals/?key=tvw7u8QvGqetCNUf"+q);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		InputStream response = null;
		
		
		try {
			
			
			response = connection.getInputStream();
			BufferedReader reader = read("http://api.yipit.com/v1/deals/?key=tvw7u8QvGqetCNUf");
			StringBuffer html_data = new StringBuffer("");
			String line = reader.readLine();

			while (line != null) {
//				System.out.println(line);
				line = reader.readLine();
				html_data.append(line);}
			String[] output = html_data.toString().split("pre>");
			output[0]="{"+output[0];
			output[0]=output[0].substring(0, output[0].length()-2);
			
			int index1= output[0].indexOf("response");
			output[0]=output[0].substring(index1+10, output[0].length()-1);
			System.out.println(output[0]);
			
			System.out.println(output[0]);
			//parse1(output[0]);
		
			response = new ByteArrayInputStream(output[0].getBytes("UTF-8"));
			return parseSearchResponse(response);
		} finally {
			if (response != null) {
				response.close();
			}
		}
	}

	public static BufferedReader read(String url) throws Exception{
		return new BufferedReader(
			new InputStreamReader(
				new URL(url).openStream()));}
	
	private List<yipit> parseSearchResponse(InputStream response) throws IOException {
	
		
		Reader reader = new InputStreamReader(response);
	SearchResponse searchResponse = new Gson().fromJson(reader, SearchResponse.class);
	
	//SearchResponse searchResponse1= new SearchResponse();
	return searchResponse.deals;
	//return searchResponse.deals;
	}
	
	private class SearchResponse {
		public List<yipit> deals;
	}


}
