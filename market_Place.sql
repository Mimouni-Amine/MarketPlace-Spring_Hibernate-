SET FOREIGN_KEY_CHECKS = 1;
drop SCHEMA if exists market_Place;
CREATE SCHEMA market_Place;

drop table if exists market_Place.client;
CREATE TABLE market_Place.client( `id` int(11) NOT NULL AUTO_INCREMENT,
					`panier` varchar(64) DEFAULT NULL,
                    `moyen_de_payement` varchar(64) DEFAULT NULL,
					PRIMARY KEY (`id`)) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

drop table if exists market_Place.vendeur;
CREATE TABLE market_Place.vendeur( `id` int(11) NOT NULL AUTO_INCREMENT,
					`inventaire` varchar(64) DEFAULT NULL,
                    `historique` varchar(64) DEFAULT NULL,
					PRIMARY KEY (`id`)) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


drop table if exists market_Place.addresse;
CREATE TABLE market_Place.addresse( `id` int(11) NOT NULL AUTO_INCREMENT,
					`rue` varchar(64) DEFAULT NULL,
                    `numero` varchar(64) DEFAULT NULL,
                    `code_postal` varchar(64) DEFAULT NULL,
					`ville` varchar(64) DEFAULT NULL, 
                    `pays` varchar(64) DEFAULT NULL, 
					PRIMARY KEY (`id`)
         
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
                    

drop table if exists market_Place.utilisateur;
CREATE TABLE market_Place.utilisateur( `id` int(11) NOT NULL AUTO_INCREMENT,
					`user_name` varchar(64) DEFAULT NULL,
                    `mot_de_passe` varchar(64) DEFAULT NULL,
                    `nom` varchar(64) DEFAULT NULL,
					`prenom` varchar(64) DEFAULT NULL, 
                    `numero` varchar(64) DEFAULT NULL, 
                    `email` varchar(64) DEFAULT NULL, 
                    `addresse_id` int(11) DEFAULT NULL, 
                    `date_dinscription` varchar(64) DEFAULT NULL, 
                    `photo_de_profil` varchar(64) DEFAULT NULL, 
                    `client_id` int(11) DEFAULT NULL, 
                    `vendeur_id` int(11) DEFAULT NULL, 
					PRIMARY KEY (`id`),
                    
 FOREIGN KEY (`client_id`)  REFERENCES `client` (`id`)  ON DELETE NO ACTION ON UPDATE NO ACTION,
 FOREIGN KEY (`addresse_id`)  REFERENCES `addresse` (`id`)  ON DELETE NO ACTION ON UPDATE NO ACTION,
 FOREIGN KEY (`vendeur_id`)  REFERENCES `vendeur` (`id`)  ON DELETE NO ACTION ON UPDATE NO ACTION

) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
                    

				
                
                
                
                