package br.com.wsp.fly.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "tb_for_you")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForYou {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "fy_id")
    private Long fyId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String content;

    @CreationTimestamp
    private Instant creationTimestamp;
}