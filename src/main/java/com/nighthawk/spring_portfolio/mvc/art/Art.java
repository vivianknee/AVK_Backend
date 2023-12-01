package com.nighthawk.spring_portfolio.mvc.art;
import com.vladmihalcea.hibernate.type.json.JsonType;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Convert(attributeName ="art", converter = JsonType.class)

public class Art {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //@Column(unique=true)
    private String ArtName;
    private String ArtistName;
    private Integer ArtistAge;

    private int like;

    public Art(String ArtName, String ArtistName, Integer ArtistAge) {
        this.ArtName = ArtName; 
        this.ArtistName = ArtistName;
        this.ArtistAge = ArtistAge;
   }

   public static Art[] init(){
        Art a1 = new Art();
        a1.setArtName("Starry Night");
        a1.setArtistName("Vincent van Gogh");
        a1.setArtistAge(37);

        Art a2 = new Art();
        a2.setArtName("Mona Lisa");
        a2.setArtistName("Leonardo da Vinci");
        a2.setArtistAge(51);

        Art a3 = new Art();
        a3.setArtName("The Persistence of Memory");
        a3.setArtistName("Salvador Dali");
        a3.setArtistAge(60);

        Art a4 = new Art();
        a4.setArtName("Guernica");
        a4.setArtistName("Pablo Picasso");
        a4.setArtistAge(91);

        Art a5 = new Art();
        a5.setArtName("The Scream");
        a5.setArtistName("Edvard Munch");
        a5.setArtistAge(55);

        Art a6 = new Art();
        a6.setArtName("Primavera");
        a6.setArtistName("Sandro Botticelli");
        a6.setArtistAge(64);

        Art a7 = new Art();
        a7.setArtName("The Last Supper");
        a7.setArtistName("Leonardo da Vinci");
        a7.setArtistAge(67);

        Art a8 = new Art();
        a8.setArtName("Water Lilies");
        a8.setArtistName("Claude Monet");
        a8.setArtistAge(86);

        Art a9 = new Art();
        a9.setArtName("Irises");
        a9.setArtistName("Vincent van Gogh");
        a9.setArtistAge(36);

        Art a10 = new Art();
        a10.setArtName("Sunrise");
        a10.setArtistName("Claude Monet");
        a10.setArtistAge(86);

        Art a11 = new Art();
        a11.setArtName("The Night Cafe");
        a11.setArtistName("Vincent van Gogh");
        a11.setArtistAge(36);

        Art a12 = new Art();
        a12.setArtName("The Girl with a Pearl Earring");
        a12.setArtistName("Johannes Vermeer");
        a12.setArtistAge(43);

        Art a13 = new Art();
        a13.setArtName("The Great Wave off Kanagawa");
        a13.setArtistName("Katsushika Hokusai");
        a13.setArtistAge(71);

        Art a14 = new Art();
        a14.setArtName("The Birth of Adam");
        a14.setArtistName("Michelangelo");
        a14.setArtistAge(88);

        Art a15 = new Art();
        a15.setArtName("The Sleeping Gypsy");
        a15.setArtistName("Henri Rousseau");
        a15.setArtistAge(65);

        Art a16 = new Art();
        a16.setArtName("The Dance Class");
        a16.setArtistName("Edgar Degas");
        a16.setArtistAge(83);

        Art a17 = new Art();
        a17.setArtName("The Garden of Earthly Delights");
        a17.setArtistName("Hieronymus Bosch");
        a17.setArtistAge(62);

        Art a18 = new Art();
        a18.setArtName("The Kiss");
        a18.setArtistName("Gustav Klimt");
        a18.setArtistAge(55);

        Art a19 = new Art();
        a19.setArtName("Les Demoiselles d'Avignon");
        a19.setArtistName("Pablo Picasso");
        a19.setArtistAge(73);

        Art a20 = new Art();
        a20.setArtName("Nighthawks");
        a20.setArtistName("Edward Hopper");
        a20.setArtistAge(74);

        Art a21 = new Art();
        a21.setArtName("The Persistence of Memory");
        a21.setArtistName("Salvador Dali");
        a21.setArtistAge(57);

        Art a22 = new Art();
        a22.setArtName("Starry Night Over the Rhône");
        a22.setArtistName("Vincent van Gogh");
        a22.setArtistAge(44);

        Art a23 = new Art();
        a23.setArtName("The Thinker");
        a23.setArtistName("Auguste Rodin");
        a23.setArtistAge(78);

        Art a24 = new Art();
        a24.setArtName("The Birth of Venus");
        a24.setArtistName("Sandro Botticelli");
        a24.setArtistAge(57);

        Art a25 = new Art();
        a25.setArtName("American Gothic");
        a25.setArtistName("Grant Wood");
        a25.setArtistAge(66);

        Art a26 = new Art();
        a26.setArtName("Whistler's Mother");
        a26.setArtistName("James McNeill Whistler");
        a26.setArtistAge(73);

        Art a27 = new Art();
        a27.setArtName("The Scream");
        a27.setArtistName("Edvard Munch");
        a27.setArtistAge(56);

        Art a28 = new Art();
        a28.setArtName("The School of Athens");
        a28.setArtistName("Raphael");
        a28.setArtistAge(37);

        Art a29 = new Art();
        a29.setArtName("The Luncheon of the Boating Party");
        a29.setArtistName("Pierre-Auguste Renoir");
        a29.setArtistAge(74);

        Art a30 = new Art();
        a30.setArtName("The Old Guitarist");
        a30.setArtistName("Pablo Picasso");
        a30.setArtistAge(91);

        Art art[] = {
            a1, a2, a3, a4, a5,
            a6, a7, a8, a9, a10,
            a11, a12, a13, a14, a15,
            a16, a17, a18, a19, a20,
            a21, a22, a23, a24, a25,
            a26, a27, a28, a29, a30
        };
        return(art);
   }

   public static void main(String[] args) {
    // obtain Art from initializer
    Art art[] = init();

    for( Art arts : art) {
        System.out.println(arts);  // print object
    }
}
}
