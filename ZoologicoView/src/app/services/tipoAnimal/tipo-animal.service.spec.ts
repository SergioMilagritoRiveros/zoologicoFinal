import { TestBed } from '@angular/core/testing';

import { TipoAnimalService } from './tipo-animal.service';

describe('TipoAnimalService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: TipoAnimalService = TestBed.get(TipoAnimalService);
    expect(service).toBeTruthy();
  });
});
