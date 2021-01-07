class SquareController < ApplicationController
    def new
       answer = params[:x].to_i * params[:x].to_i
       render json: answer
    end
end
