import { TestBed } from '@angular/core/testing';

import { TipoEspacioService } from './tipo-espacio.service';

describe('TipoEspacioService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: TipoEspacioService = TestBed.get(TipoEspacioService);
    expect(service).toBeTruthy();
  });
});
