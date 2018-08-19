package com.niche.ng.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A GodownStock.
 */
@Entity
@Table(name = "godown_stock")
public class GodownStock implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "current_quantity")
    private Long currentQuantity;

    @Column(name = "added_quantity")
    private Long addedQuantity;

    @Column(name = "consumed_quantity")
    private Long consumedQuantity;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private Integer status;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "modified_by")
    private Long modifiedBy;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @OneToMany(mappedBy = "godownStock")
    private Set<GodownStockDetails> godownStockDetails = new HashSet<>();

    @ManyToOne
    @JsonIgnoreProperties("godownStockVarietys")
    private PickListValue pickListVariety;

    @ManyToOne
    @JsonIgnoreProperties("godownStockCategorys")
    private PickListValue pickListCategory;

    @ManyToOne
    @JsonIgnoreProperties("godownStockQuantityTypes")
    private PickListValue pickListQuantityType;

    @ManyToOne
    @JsonIgnoreProperties("godownStocks")
    private Godown godown;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCurrentQuantity() {
        return currentQuantity;
    }

    public GodownStock currentQuantity(Long currentQuantity) {
        this.currentQuantity = currentQuantity;
        return this;
    }

    public void setCurrentQuantity(Long currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public Long getAddedQuantity() {
        return addedQuantity;
    }

    public GodownStock addedQuantity(Long addedQuantity) {
        this.addedQuantity = addedQuantity;
        return this;
    }

    public void setAddedQuantity(Long addedQuantity) {
        this.addedQuantity = addedQuantity;
    }

    public Long getConsumedQuantity() {
        return consumedQuantity;
    }

    public GodownStock consumedQuantity(Long consumedQuantity) {
        this.consumedQuantity = consumedQuantity;
        return this;
    }

    public void setConsumedQuantity(Long consumedQuantity) {
        this.consumedQuantity = consumedQuantity;
    }

    public String getDescription() {
        return description;
    }

    public GodownStock description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public GodownStock status(Integer status) {
        this.status = status;
        return this;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public GodownStock createdBy(Long createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public GodownStock modifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public GodownStock createdAt(Instant createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public GodownStock updatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Set<GodownStockDetails> getGodownStockDetails() {
        return godownStockDetails;
    }

    public GodownStock godownStockDetails(Set<GodownStockDetails> godownStockDetails) {
        this.godownStockDetails = godownStockDetails;
        return this;
    }

    public GodownStock addGodownStockDetails(GodownStockDetails godownStockDetails) {
        this.godownStockDetails.add(godownStockDetails);
        godownStockDetails.setGodownStock(this);
        return this;
    }

    public GodownStock removeGodownStockDetails(GodownStockDetails godownStockDetails) {
        this.godownStockDetails.remove(godownStockDetails);
        godownStockDetails.setGodownStock(null);
        return this;
    }

    public void setGodownStockDetails(Set<GodownStockDetails> godownStockDetails) {
        this.godownStockDetails = godownStockDetails;
    }

    public PickListValue getPickListVariety() {
        return pickListVariety;
    }

    public GodownStock pickListVariety(PickListValue pickListValue) {
        this.pickListVariety = pickListValue;
        return this;
    }

    public void setPickListVariety(PickListValue pickListValue) {
        this.pickListVariety = pickListValue;
    }

    public PickListValue getPickListCategory() {
        return pickListCategory;
    }

    public GodownStock pickListCategory(PickListValue pickListValue) {
        this.pickListCategory = pickListValue;
        return this;
    }

    public void setPickListCategory(PickListValue pickListValue) {
        this.pickListCategory = pickListValue;
    }

    public PickListValue getPickListQuantityType() {
        return pickListQuantityType;
    }

    public GodownStock pickListQuantityType(PickListValue pickListValue) {
        this.pickListQuantityType = pickListValue;
        return this;
    }

    public void setPickListQuantityType(PickListValue pickListValue) {
        this.pickListQuantityType = pickListValue;
    }

    public Godown getGodown() {
        return godown;
    }

    public GodownStock godown(Godown godown) {
        this.godown = godown;
        return this;
    }

    public void setGodown(Godown godown) {
        this.godown = godown;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GodownStock godownStock = (GodownStock) o;
        if (godownStock.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), godownStock.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "GodownStock{" +
            "id=" + getId() +
            ", currentQuantity=" + getCurrentQuantity() +
            ", addedQuantity=" + getAddedQuantity() +
            ", consumedQuantity=" + getConsumedQuantity() +
            ", description='" + getDescription() + "'" +
            ", status=" + getStatus() +
            ", createdBy=" + getCreatedBy() +
            ", modifiedBy=" + getModifiedBy() +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            "}";
    }
}
