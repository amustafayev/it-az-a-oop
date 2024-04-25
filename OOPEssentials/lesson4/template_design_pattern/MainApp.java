package lesson4.template_design_pattern;

import lesson4.template_design_pattern.networks.FaceBookNetwork;
import lesson4.template_design_pattern.networks.Network;
import lesson4.template_design_pattern.networks.Twitter;
import lesson4.template_design_pattern.smm.NetworkManager;

public class MainApp {
    public static void main(String[] args) {
        Network faceBookNetwork = new FaceBookNetwork();
        Twitter twitter = new Twitter();
        NetworkManager networkManager = new NetworkManager();
        networkManager.shareTodaysNews("Today's cool news", faceBookNetwork);
        networkManager.shareTodaysNews("Today's cool news 2", twitter);

    }
}
