import { Component, OnInit } from '@angular/core';
import { IProduct } from 'src/app/models/product.model';
import { CheckoutService } from 'src/app/services/checkout.service';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html'
})
export class CheckoutComponent implements OnInit {

  loading: boolean = false;
  product : IProduct = {
    id: 1234,
    title: 'Celular AX-13',
    description: 'Dispositivo móvil de Tienda e-commerce',
    pictureUrl: '../../../../assets/images/celular.jpg',
    unitPrice: 10.55,
    quantity: 1
  }

  constructor(private checkoutService: CheckoutService) { }

  ngOnInit(): void {
  }

  generatePreference(): void {
    this.loading = true;
    this.checkoutService.generatePreference(this.product).subscribe(
      response => {
        console.log(response);
        this.loading = false;
        window.location.href = response.body.initPoint;
      },
      error => {
        console.log(error);
        this.loading = false;
      }
    );
  }

}
