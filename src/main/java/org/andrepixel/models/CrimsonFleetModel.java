package org.andrepixel.models;

public class CrimsonFleetModel extends TicketModel {
    private Boolean hasPopCorn;

    public CrimsonFleetModel() {
        super();
    }

    public Boolean getHasPopCorn() {
        return hasPopCorn;
    }

    public void setHasPopCorn(
            Boolean hasPopCorn) {
        this.hasPopCorn = hasPopCorn;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result
                + ((hasPopCorn == null) ? 0
                        : hasPopCorn.hashCode());
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
        CrimsonFleetModel other = (CrimsonFleetModel) obj;
        if (hasPopCorn == null) {
            if (other.hasPopCorn != null)
                return false;
        } else if (!hasPopCorn
                .equals(other.hasPopCorn))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CrimsonFleetModel [" + super.toString()
                + ", hasPopCorn=" + hasPopCorn
                + "]";
    }
}
