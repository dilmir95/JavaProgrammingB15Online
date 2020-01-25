package day44.sub;

import day44.SlackUser;

public class SlackUserAdmin extends SlackUser {

    int adminId;

    public void deleteMessage(){
        System.out.println("Deleting message: ");
    }
    public void addChannel(String x ){
        System.out.println("adding channel: "+x);
    }

    @Override
    public String toString() {
        return "SlackUserAdmin{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public SlackUserAdmin(String name, String status, int adminId) {
        this.name = name;
        this.status = status;
        this.adminId = adminId;

    }

    public static void main(String[] args) {

        SlackUserAdmin sa1 = new SlackUserAdmin("Akbar","hold your horse", 777);
        sa1.addChannel("group18");
        sa1.deleteMessage();


    }
}
