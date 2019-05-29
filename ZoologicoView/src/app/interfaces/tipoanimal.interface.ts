import { Especie } from "./especie.interface";
import { Genero } from "./genero.interface";

export interface TipoAnimal{
    Descripcion:string
    EspecieID:Especie
    GeneroID:Genero
    id:number
}