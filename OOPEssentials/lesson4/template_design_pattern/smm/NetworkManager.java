package lesson4.template_design_pattern.smm;

import lesson4.template_design_pattern.networks.Network;

public class NetworkManager {

    public void shareTodaysNews(String data, Network network) {

        network.sharePost(data);
    }


}
