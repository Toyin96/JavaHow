// This is the application class for class Tv
// This program was written by Toyin Onagoruwa (Lord Toyin Tenjin) on 14/11/2020
public class Tv {

    private String tvName;
    private boolean isOn;
    private String channel;
    private int volume = 0;
    private String channelMenu = "DSTV, MiTV, STV, ChannelO, MTV Base, MNET, MSTAR,Natgeo wild, Cartoon Network, E! Entertainment,";

//    public Tv(String tvName){
//        this.tvName = tvName;
//    }

    public boolean isOn() {
        return isOn;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel(){
        return channel;
    }

    public String getChannelMenu(){
        return channelMenu;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 10) {
            this.volume = volume;
        }else{
            if(volume > 10)
            System.out.println("Volume cannot be set above 10");
        } if (volume < 0){
                System.out.println("Volume cannot be set below 0");
            }
        }

    public String getTvName() {
        return tvName;
    }

    public int getTvVolume() {
        return volume;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public void increaseVolume(int volume) {
        if (volume >= 0 && volume < 10)
            this.volume = volume + 1;
        System.out.println("Your Tv volume is now: " + this.volume);
    }

    public void reduceVolume(int volume) {
        if (volume > 0 && volume <= 10) {
            this.volume = volume - 1;
            System.out.println("Your Tv volume is now: " + this.volume);
        }else {
            if (volume == 0){
                System.out.println("Volume is already set at the lowest point!");
            }
        }
    }

    public void printTvStatus(boolean isOn){
        if (isOn == false) {
            System.out.println("Tv is turned on");
        }else {
            System.out.println("Tv is turned off");
        }
    }


    public void setOn(boolean setOn) {
        this.isOn = setOn;
    }
}



