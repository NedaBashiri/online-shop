import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent} from './app.component'
import {AppRoutingModule} from './app-routing.module';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { ProductListComponent } from './components/product-list/product-list.component';
import {ProductService} from "./services/product.service";
import { ProductCategoryMenuComponent } from './components/product-category-menu/product-category-menu.component';






@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    ProductCategoryMenuComponent,


  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,

  ],

  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
