package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker
    private String user;
    private String topic;

    public CreateTopicMsg(String user, String topic) {
        super(MessageType.CREATETOPIC, user);
    this.user=user;
    this.topic=topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public String getUser(){
        return user;
    }
    public String getTopic(){
        return topic;
    }

    @Override
    public String toString() {
        return "CreateTopicMsg{" +
                "user='" + user + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
    // TODO:

	// Implement object variables - a topic is required
	
	// Complete the constructor, get/set-methods, and toString method
    // as described in the project text	
}
