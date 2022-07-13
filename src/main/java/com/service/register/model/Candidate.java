package com.service.register.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Candidate", schema="pharos.register")
public class Candidate {

    @Id
    @Column(name="idCandidate", length=36, nullable=false)
    private String idCandidate;

    @Column(name="username", length=45, nullable=false)
    private String username;

    @Column(name="code", length=45, nullable=false)
    private String code;

    @Column(name="status", length=10, nullable=false)
    private String status;

    @Column(name="isActive", length=10, nullable=false)
    private String isActive;

    public String getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(String idCandidate) {
        this.idCandidate = idCandidate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Candidate{");
        sb.append("idCandidate='").append(idCandidate).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", code='").append(code).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", isActive='").append(isActive).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
