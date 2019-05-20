import { Especie } from "./especie.interface";
import { Genero } from "./genero.interface";

export interface TipoAnimal{
    descripcion:string
    especieID:Especie
    generoID:Genero
    id:number
}