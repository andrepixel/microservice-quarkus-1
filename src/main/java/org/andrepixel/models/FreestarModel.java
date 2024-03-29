package org.andrepixel.models;

public class FreestarModel extends TicketModel {
    private Boolean isIMAX;

    public FreestarModel() {
        super();
    }

    public Boolean getIsIMAX() {
        return isIMAX;
    }

    public void setIsIMAX(Boolean isIMAX) {
        this.isIMAX = isIMAX;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result
                + ((isIMAX == null) ? 0
                        : isIMAX.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        FreestarModel other = (FreestarModel) obj;
        if (isIMAX == null) {
            if (other.isIMAX != null)
                return false;
        } else if (!isIMAX.equals(other.isIMAX))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "FreestarModel ["
                + super.toString() + ", isIMAX="
                + isIMAX + "]";
    }
}
