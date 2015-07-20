package modal;

/**
 * Created by The on 19/07/2015.
 */
public class Country {
    private String mcountry_name;

    public Country(String classID, String state) {
        this.mcountry_name = classID;
        this.mcode = state;
    }

    public String getMcode() {
        return mcode;
    }

    public void setMcode(String mcode) {
        this.mcode = mcode;
    }

    private String mcode;

    public String getMcountry_name() {
        return mcountry_name;
    }

    public void setMcountry_name(String mcountry_name) {
        this.mcountry_name = mcountry_name;
    }
}
