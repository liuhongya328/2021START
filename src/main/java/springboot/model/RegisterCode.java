package springboot.model;

import java.io.Serializable;

public class RegisterCode implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column register_code.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column register_code.org_id
     *
     * @mbg.generated
     */
    private String orgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column register_code.last_org
     *
     * @mbg.generated
     */
    private String lastOrg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column register_code.isManager
     *
     * @mbg.generated
     */
    private String ismanager;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column register_code.register_number
     *
     * @mbg.generated
     */
    private String registerNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column register_code.isUse
     *
     * @mbg.generated
     */
    private String isuse;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column register_code.create_time
     *
     * @mbg.generated
     */
    private String createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column register_code.update_time
     *
     * @mbg.generated
     */
    private String updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table register_code
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register_code.id
     *
     * @return the value of register_code.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register_code.id
     *
     * @param id the value for register_code.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register_code.org_id
     *
     * @return the value of register_code.org_id
     *
     * @mbg.generated
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register_code.org_id
     *
     * @param orgId the value for register_code.org_id
     *
     * @mbg.generated
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register_code.last_org
     *
     * @return the value of register_code.last_org
     *
     * @mbg.generated
     */
    public String getLastOrg() {
        return lastOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register_code.last_org
     *
     * @param lastOrg the value for register_code.last_org
     *
     * @mbg.generated
     */
    public void setLastOrg(String lastOrg) {
        this.lastOrg = lastOrg == null ? null : lastOrg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register_code.isManager
     *
     * @return the value of register_code.isManager
     *
     * @mbg.generated
     */
    public String getIsmanager() {
        return ismanager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register_code.isManager
     *
     * @param ismanager the value for register_code.isManager
     *
     * @mbg.generated
     */
    public void setIsmanager(String ismanager) {
        this.ismanager = ismanager == null ? null : ismanager.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register_code.register_number
     *
     * @return the value of register_code.register_number
     *
     * @mbg.generated
     */
    public String getRegisterNumber() {
        return registerNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register_code.register_number
     *
     * @param registerNumber the value for register_code.register_number
     *
     * @mbg.generated
     */
    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber == null ? null : registerNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register_code.isUse
     *
     * @return the value of register_code.isUse
     *
     * @mbg.generated
     */
    public String getIsuse() {
        return isuse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register_code.isUse
     *
     * @param isuse the value for register_code.isUse
     *
     * @mbg.generated
     */
    public void setIsuse(String isuse) {
        this.isuse = isuse == null ? null : isuse.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register_code.create_time
     *
     * @return the value of register_code.create_time
     *
     * @mbg.generated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register_code.create_time
     *
     * @param createTime the value for register_code.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register_code.update_time
     *
     * @return the value of register_code.update_time
     *
     * @mbg.generated
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register_code.update_time
     *
     * @param updateTime the value for register_code.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register_code
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RegisterCode other = (RegisterCode) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getLastOrg() == null ? other.getLastOrg() == null : this.getLastOrg().equals(other.getLastOrg()))
            && (this.getIsmanager() == null ? other.getIsmanager() == null : this.getIsmanager().equals(other.getIsmanager()))
            && (this.getRegisterNumber() == null ? other.getRegisterNumber() == null : this.getRegisterNumber().equals(other.getRegisterNumber()))
            && (this.getIsuse() == null ? other.getIsuse() == null : this.getIsuse().equals(other.getIsuse()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register_code
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getLastOrg() == null) ? 0 : getLastOrg().hashCode());
        result = prime * result + ((getIsmanager() == null) ? 0 : getIsmanager().hashCode());
        result = prime * result + ((getRegisterNumber() == null) ? 0 : getRegisterNumber().hashCode());
        result = prime * result + ((getIsuse() == null) ? 0 : getIsuse().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

	@Override
	public String toString() {
		return "RegisterCode [id=" + id + ", orgId=" + orgId + ", lastOrg="
				+ lastOrg + ", ismanager=" + ismanager + ", registerNumber="
				+ registerNumber + ", isuse=" + isuse + ", createTime="
				+ createTime + ", updateTime=" + updateTime + "]";
	}

   
}