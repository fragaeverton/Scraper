package co.evertonfraga.scraper.entities;

import lombok.*;

import jakarta.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "product")
@SecondaryTable(name = "price", pkJoinColumns = @PrimaryKeyJoinColumn(name = "productid"))
@SecondaryTable(name = "nickname", pkJoinColumns = @PrimaryKeyJoinColumn(name = "productid"))
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String image;
    private String url;

    @Column(table = "nickname", name = "name")
    private String nickname;

    @Column(table = "price")
    private Double price;

    @Column(name = "shopid")
    private Integer shopId;

    @ManyToOne
    @JoinColumn(name = "shopid", referencedColumnName = "id", insertable = false, updatable = false)
    private Shop shop;

}
