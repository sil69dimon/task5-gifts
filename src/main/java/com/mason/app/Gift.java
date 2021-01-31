package com.mason.app;

public class Gift {

    private final Package pack;
    private final Sweets sweets;

    public Gift(GiftBuilder giftBuilder) {
        this.sweets = giftBuilder.sweets;
        this.pack = giftBuilder.pack;
    }

    public Package getPack() {
        return pack;
    }

    public Sweets getSweets() {
        return sweets;
    }

  /*  @Override
    public String toString() {

        var sb = new StringBuilder();
        sb.append("This is a ")
                .append(profession)
                .append(" named ")
                .append(name);
        if (hairColor != null || hairType != null) {
            sb.append(" with ");
            if (hairColor != null) {
                sb.append(hairColor).append(' ');
            }
            if (hairType != null) {
                sb.append(hairType).append(' ');
            }
            sb.append(hairType != HairType.BALD ? "hair" : "head");
        }
        if (armor != null) {
            sb.append(" wearing ").append(armor);
        }
        if (weapon != null) {
            sb.append(" and wielding a ").append(weapon);
        }
        sb.append('.');
        return sb.toString();
    }

   */

    /**
     * The builder class.
     */

}