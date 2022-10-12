import {Column, Entity, ManyToOne, OneToMany, PrimaryGeneratedColumn} from "typeorm";
import {CarMarkEntity} from "./car-mark.entity";
import {CarGenerationEntity} from "./car-generation.entity";

@Entity({name: 'models'})
export class CarModelEntity {
    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    systemId: string;

    @Column()
    name: string;

    @OneToMany(() => CarGenerationEntity, carGeneration => carGeneration.carModel)
    carGenerations: CarGenerationEntity[];

    @ManyToOne(() => CarMarkEntity, carMark => carMark.carModels)
    carMark: CarMarkEntity;
}
