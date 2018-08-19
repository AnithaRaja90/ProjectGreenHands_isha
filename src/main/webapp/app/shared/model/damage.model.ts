import { Moment } from 'moment';

export interface IDamage {
    id?: number;
    noOfQuantity?: number;
    description?: string;
    date?: Moment;
    status?: number;
    createdBy?: number;
    modifiedBy?: number;
    createdAt?: Moment;
    updatedAt?: Moment;
    batchBatchName?: string;
    batchId?: number;
}

export class Damage implements IDamage {
    constructor(
        public id?: number,
        public noOfQuantity?: number,
        public description?: string,
        public date?: Moment,
        public status?: number,
        public createdBy?: number,
        public modifiedBy?: number,
        public createdAt?: Moment,
        public updatedAt?: Moment,
        public batchBatchName?: string,
        public batchId?: number
    ) {}
}

export class DamageModel {
    id?: number;
    noOfQuantity?: number;
    description?: string;
    date?: Moment;
    status?: number;
    createdBy?: number;
    modifiedBy?: number;
    createdAt?: Moment;
    updatedAt?: Moment;
    batchBatchName?: string;
    batchId?: number;
}

export const STATUS_SEEDS = 1;
export const STATUS_SEEDLING = 2;
export const STATUS_SAPLING = 3;
export const STATUS_DISTRIBUTION = 4;
