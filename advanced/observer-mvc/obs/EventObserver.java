package obs;
public class EventObserver implements Observer {
    private String name;
	private Subject topic;
	
	public EventObserver(String nm){
		this.name=nm;
	}
	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null){
			System.out.println(name+":: No new message");
        }
        else{
            System.out.println(name+":: Listen ::"+msg);
        }
		
	}

	@Override
	public void setSubject(Subject sub) {
		this.topic=sub;
	}
}