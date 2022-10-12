import {Column, Entity, ManyToOne, PrimaryGeneratedColumn} from "typeorm";
import {CarModelEntity} from "./car-model.entity";

@Entity({name: 'generations'})
export class CarGenerationEntity {
    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    name: string;

    @Column()
    firstYear: number;

    @Column()
    secondYear: number;

    @Column()
    isRest: boolean;

    @ManyToOne(() => CarModelEntity, carModel => carModel.carGenerations)
    carModel: CarModelEntity;
}
