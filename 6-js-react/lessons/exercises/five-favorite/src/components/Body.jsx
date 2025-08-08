import React, {useState, useEffect} from 'react';
import '../App.css';
import Expansion from './Expansion';

export default function Body() {
    const [expansions, setExpansions] = useState([]);

    useEffect(() => { setExpansions ( [
        {
            "id": 1,
            "series": "base set",
            "expansion": "base era",
            "artist": "ken sugimori, various artists",
            "lore": "the base set tells the story of a new trainer beginning their journey in kanto, " +
                "catching and raising pokémon while gathering resources and support from allies.\n" +
                "they grow stronger through battles, face powerful opponents, and ultimately encounter legendary " +
                "pokémon like mewtwo at the height of their adventure."
        },
        {
            "id": 2,
            "series":"sword & shield",
            "expansion": "lost origin",
            "artist": "satoshi tajiri, various artists",
            "lore": "this expansion explores the lore of the pokémon world, particularly " +
                "focusing on the concept of a forgotten realm and the impact of ancient events"
        },
        {
            "id": 3,
            "series": "evolutions",
            "expansion":"xy",
            "artist": "original base set",
            "lore": "homage to the original cards, updating them for new gameplay and aesthetic appeal"
        },

        {
            "id": 4,
            "series": "evolving skies",
            "expansion":"sword & shield",
            "artist": "mitsuhiro arita, various artists",
            "lore": "centers on the dynamic power and evolution of dragon-type and eevee family pokémon " +
                "soaring through the skies, symbolizing growth, change, and untapped potential"
        },
        {
            "id": 2,
            "series": "base era",
            "expansion": "fossil",
            "artist": "mitsuhiro arita, various artists",
            "lore": "ancient pokémon revived from prehistoric remains, emerging alongside mysterious " +
                "sea and cave-dwelling species, hinting at a hidden world of legendary birds and primordial power " +
                "beneath the surface of the pokémon world."
        }
    ])
    }, []);

    const expansionList = [];
    return (
        <div>
            <ul>
                {
                    expansions.map((expansions) => (
                        <Expansion id ={expansions.id} series={expansions.series} expansion={expansions.expansion}
                                   artist={expansions.artist} lore={expansions.lore} />
                    ))}
            </ul>
        </div>
    );
}

// make top 5 of favorite xyz