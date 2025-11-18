package _27303.q3;

import java.time.LocalDateTime;
import java.util.regex.Pattern;

public class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;

    public TaxAuthority(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                        String authorityName, String region, String email) throws TaxDataException {
        super(id, createdDate, updatedDate);
        setAuthorityName(authorityName);
        setRegion(region);
        setEmail(email);
    }

    public String getAuthorityName() { return authorityName; }
    public void setAuthorityName(String authorityName) throws TaxDataException {
        if (authorityName == null || authorityName.trim().isEmpty())
            throw new TaxDataException("authorityName cannot be empty");
        this.authorityName = authorityName;
    }

    public String getRegion() { return region; }
    public void setRegion(String region) throws TaxDataException {
        if (region == null || region.trim().isEmpty()) throw new TaxDataException("region required");
        this.region = region;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) throws TaxDataException {
        if (email == null || !Pattern.matches("^[\\w-.]+@[\\w-]+\\.[A-Za-z]{2,}$", email))
            throw new TaxDataException("invalid authority email");
        this.email = email;
    }

    @Override
    public String toString() {
        return "TaxAuthority{" + authorityName + ", region=" + region + ", email=" + email + "}";
    }
}
