<?php

namespace ACME\HelloWorld\Repositories;

use Webkul\Core\Eloquent\Repository;

class HelloWorldRepository extends Repository
{
    /**
     * Specify Model class name
     *
     * @return mixed
     */
    function model()
    {
        return 'ACME/HelloWorld/Contracts/HelloWorld';
    }
}
