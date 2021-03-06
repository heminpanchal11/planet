package planet.entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//this is for Type Single Table
//@DiscriminatorValue(value = "NS")
//this is for Type JoinColumn
//@PrimaryKeyJoinColumn(referencedColumnName="sid")
public class NonTeachingStaff extends Staff {
    private String areaexpertise;

    public NonTeachingStaff(int sid, String sname, String areaexpertise) {
        super(sid, sname);
        this.areaexpertise = areaexpertise;
    }

    public NonTeachingStaff() {
        super();
    }

    public String getAreaexpertise() {
        return areaexpertise;
    }

    public void setAreaexpertise(String areaexpertise) {
        this.areaexpertise = areaexpertise;
    }
}
