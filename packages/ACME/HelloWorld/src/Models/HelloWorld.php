<?php

namespace ACME\HelloWorld\Models;

use Illuminate\Database\Eloquent\Model;
use ACME\HelloWorld\Contracts\HelloWorld as HelloWorldContract;

class HelloWorld extends Model implements HelloWorldContract
{
    protected $fillable = [];
}
