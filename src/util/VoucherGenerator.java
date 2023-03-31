package util;

import java.util.UUID;

public class VoucherGenerator {

    public String generator(){
        return UUID.randomUUID().toString();
    }
}
