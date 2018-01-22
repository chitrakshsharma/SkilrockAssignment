import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Demo {
	public static void main(String[] args){
		new Demo().go();
	}
	
	public void go(){
		System.out.println("Hello");
		List list = getTicketBeans();
		Map<String,String> aliasNameMap = new HashMap();
		String value = "ussd.africabet";
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			TicketBean tb = (TicketBean)iter.next();
			String key = "7"+"3";
			System.out.println(key);
			aliasNameMap.put(key, value);
		}
		
		System.out.println(aliasNameMap);
		
		iter = list.iterator();
		while(iter.hasNext()){
			TicketBean tb = (TicketBean)iter.next();
			String key = tb.getMerchantId()+tb.getPartyId()+"";
			System.out.println(aliasNameMap.get(key));
		}
	}
	
	public List getTicketBeans(){
		List list = new ArrayList();
		list.add(new TicketBean(7, 3));
		list.add(new TicketBean(8, 5));
		return list;
	}
}