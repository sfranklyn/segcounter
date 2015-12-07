/*
 * WsIdentity.java
 *
 * Created on August 27, 2007, 3:26 PM
 *
 */
package segcounter;

/**
 *
 * @author Samuel Franklyn
 */
public class XsIdentity {

    private static final String idXml;

    static {
        idXml = ""
                + "<Application>"
                + "<VendorId>FLCN</VendorId>"
                + "<VendorType>G</VendorType>"
                + "<SourceId>GNDOTS</SourceId>"
                + "<SourceType>G</SourceType>"
                + "</Application>";
    }

    public static String identity(final String userId, final String pseudo) {
        String userXml = ""
                + "<User>"
                + "<UserId>" + userId + "</UserId>"
                + "<Pseudo>" + pseudo + "</Pseudo>"
                + "</User>";

        return idXml + userXml;
    }
}
