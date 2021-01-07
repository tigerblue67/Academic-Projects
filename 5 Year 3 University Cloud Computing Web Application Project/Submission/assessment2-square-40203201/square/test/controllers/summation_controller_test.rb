require 'test_helper'

class SummationControllerTest < ActionDispatch::IntegrationTest
  test "should get index" do
    get summation_index_url
    assert_response :success
  end

end
