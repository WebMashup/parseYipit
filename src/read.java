import java.io.IOException;
import java.util.List;

public class read {
	public static void main(String argsp[]) throws Exception
	{
		StringBuilder builder = new StringBuilder("");
		yipitRead r1= new yipitRead();
		List<yipit> t1 =r1.searchDeals("a");
		for (yipit g : t1) {
			
			builder.append("<b>User: </b>");
			builder.append(g.getUrl()+g.getTitle()+g.getPrice().getFormatted()+g.getYipit_title()+g.getYipit_url()+g.getDiscount().getFormatted()+g.getValue().getFormatted());
			System.out.println(g.getTags().iterator().hasNext());
			//g.getLocations().clear();
			System.out.println("Location"+g.getBusiness().getLocations().iterator().hasNext());
			
			builder.append("<br /><b>Created: </b>");
		
			
			
		}
		System.out.println(builder);
	}
}
