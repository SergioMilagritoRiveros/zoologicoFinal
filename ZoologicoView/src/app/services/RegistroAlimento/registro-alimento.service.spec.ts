import { TestBed } from '@angular/core/testing';

import { RegistroAlimentoService } from './registro-alimento.service';

describe('RegistroAlimentoService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: RegistroAlimentoService = TestBed.get(RegistroAlimentoService);
    expect(service).toBeTruthy();
  });
});
