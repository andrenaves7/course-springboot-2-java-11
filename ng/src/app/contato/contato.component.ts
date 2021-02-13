import { ContatoService } from './../contato.service';
import { Component, OnInit } from '@angular/core';
import { Contato } from './contato';

@Component({
  selector: 'app-contato',
  templateUrl: './contato.component.html',
  styleUrls: ['./contato.component.css']
})
export class ContatoComponent implements OnInit {

  constructor(
    private service: ContatoService
  ) { }

  ngOnInit(): void {
    const c: Contato = new Contato();
    c.nome = 'Francisco';
    c.email = 'francisco@gmail.com';
    c.favorito = false;

    this.service.save(c).subscribe(r => {
      console.log(r);
    });
  }

}
