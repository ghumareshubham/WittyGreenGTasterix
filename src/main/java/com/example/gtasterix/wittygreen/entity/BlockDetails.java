package com.example.gtasterix.wittygreen.entity;



import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;


@Entity
@Table(name = "block_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BlockDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "block_id")
    private int blockId;

    @Column(name = "block_identity", nullable = false, unique = true)
    private String blockIdentity;

    @Column(name = "rack_id", nullable = false)
    private int rackId;

//    // Optional: If you want to set up a relationship with Rack entity
//    @ManyToOne
//    @JoinColumn(name = "rack_id", insertable = false, updatable = false)
//    private RackDetails rack;
}

